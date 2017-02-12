CXX = g++
CXXFLAGS = -g -std=c++11 
# Uncomment the CXXFLAGS definition below to use the parallel MR runtime
#CXXFLAGS = -g -std=c++11 -pthread -Wl,--no-as-needed -DPARALLEL_MR

all: wordCount_exc sentenceStats phrases


%.o : %.cpp mr.hpp
	$(CXX) -c $< $(CXXFLAGS) 

WC_OBJECTS = test-wordCount.o wordCount.o ioutils.o	
wordCount_exc: $(WC_OBJECTS)
	$(CXX) -o $@ $(WC_OBJECTS) $(CXXFLAGS)
	
SS_OBJECTS = test-sentenceStats.o sentenceStats.o ioutils.o	
sentenceStats: $(SS_OBJECTS)
	$(CXX) -o $@ $(SS_OBJECTS) $(CXXFLAGS)

PH_OBJECTS = test-phrases.o phrases.o ioutils.o	
phrases: $(PH_OBJECTS)
	$(CXX) -o $@ $(PH_OBJECTS) $(CXXFLAGS)

clean:
	$(RM) *.o wordCount_exc sentenceStats phrases
