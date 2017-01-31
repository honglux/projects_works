import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

import javax.swing.text.html.HTMLDocument.Iterator;

public class find_path {

    public static String filename = "graph.txt";	//change the fiel name here;
    public static int num_graphs = 1;	//By default, we only input one graphs at a time;

    public static void main(String[] args) {
        //int num_graphs=0;
        int num_nodes=0;
        int num_edges=0;

        File file = new File(filename);
        BufferedReader reader = null;

        int[] max=new int[num_graphs];
        int[] min=new int[num_graphs];
        int[] gra_path=new int[num_graphs];
        
        for(int gra_ordinal=0;gra_ordinal<num_graphs;gra_ordinal++)
        {
            String node_line,edge_line;
            
            try
            {
                reader = new BufferedReader(new FileReader(file));
                String tempString = null;
                if ((tempString = reader.readLine()) != null)
                {
                    num_nodes=Integer.parseInt(tempString);
                }
                else
                {
                    System.out.println("please indicate the node numbers in the file.");
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }

            if(num_nodes==0)
            {
                max[gra_ordinal]=Integer.MIN_VALUE;
                min[gra_ordinal]=Integer.MAX_VALUE;
                gra_path[gra_ordinal]=0;
                continue;
            }

            try
            {
                String tempString = null;
                if ((tempString = reader.readLine()) != null)
                {
                    num_edges=Integer.parseInt(tempString);
                }
                else
                {
                    System.out.println("please indicate the edge numbers in the file.");
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }


            int path=0;
            int[][] gra_edges=new int[num_nodes][num_nodes];
            try
            {
                for(int edge_ordinal=0;edge_ordinal<num_edges;edge_ordinal++)
                {
                    String input = new String();
                    
                    String tempString = null;
                    if ((tempString = reader.readLine()) != null)
                    {
                        input = tempString;
                    }
                    else
                    {
                        System.out.println("Wrong nodes number or edge number");
                        input = null;
                    }



                    String[] parts=input.split(" ");
                    int left_nod_num;
                    int right_nod_num;
                    right_nod_num=Integer.parseInt(parts[1]);
                    left_nod_num=Integer.parseInt(parts[0]);
                    gra_edges[left_nod_num-1][right_nod_num-1]=1;
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }

            
            int ix=0;
            int jx=0;
            int tes_val;
            
            Queue<Integer> queue = new LinkedList<Integer>();

            int[] max_path=new int[num_nodes];
            int[] min_path=new int[num_nodes];
            max_path[0]=0;
            min_path[0]=0;

            int temp_max,temp_min;

            for(int i=1;i<num_nodes;i++)
            {
                max_path[i]=Integer.MIN_VALUE;
            }

            for(int i=1;i<num_nodes;i++)
            {
                min_path[i]=Integer.MAX_VALUE;
            }

            if(num_nodes>1)
            {
                queue.add(0);
                while(!queue.isEmpty())
                {
                    int sta_node=queue.poll();
                    if(sta_node==(num_nodes-1))
                    {
                        path++;
                    }
                    for(int j=sta_node;j<(num_nodes);j++)
                    {
                        if(gra_edges[sta_node][j]==1)
                        {
                            queue.add(j);
                            temp_max=max_path[sta_node]+1;
                            if(temp_max>max_path[j])
                            {
                                max_path[j]=temp_max;
                            }

                            temp_min=min_path[sta_node]+1;
                            if(temp_min<min_path[j])
                            {
                                min_path[j]=temp_min;
                            }
                        }
                    }
                }
            }
            else if(num_nodes==1)
            {
                path=1;
            }

            max[gra_ordinal]=max_path[num_nodes-1];
            min[gra_ordinal]=min_path[num_nodes-1];
            gra_path[gra_ordinal]=path;

        }


        for(int gra_ordinal=0;gra_ordinal<num_graphs;gra_ordinal++)
        {
            System.out.println("graph number: "+(gra_ordinal+1));
            System.out.println("Shortest path: "+min[gra_ordinal]);
            System.out.println("Longest path: "+max[gra_ordinal]);
            System.out.println("Number of paths: "+gra_path[gra_ordinal]);
            System.out.println();
        }

    }

}
