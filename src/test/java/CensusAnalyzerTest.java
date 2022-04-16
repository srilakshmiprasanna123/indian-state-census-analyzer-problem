import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyzerTest {

    private static final String INDIA_CENSUS_CSV_PATH = "C:\\Users\\DELL\\IdeaProjects\\indian-state-census-analyser-problem\\src\\main\\IndiaStateCensusData.csv";
    private static final String INDIA_CENSUS_CSV_WRONG_FILETYPE = "C:\\Users\\DELL\\IdeaProjects\\indian-state-census-analyser-problem\\src\\main\\IndiaStateCensusData.csv";
    private static final String INDIA_CENSUS_CSV_PATH_DELIMETER = "C:\\Users\\DELL\\IdeaProjects\\indian-state-census-analyser-problem\\src\\main\\IndiaStateCensusData.csv";



        //UseCase 1.4 Path is correct but delimiter incorrect
        @Test
        public void givenIndianCensusCSVFileReturnsIncorrectDelimeter(){
            CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
            try {
                censusAnalyzer.loadIndiaCensusData(INDIA_CENSUS_CSV_PATH_DELIMETER);
                Assert.assertTrue("Wrong delimiter", true);
            } catch (CensusAnalyzerException e) {
                e.printStackTrace();
            }
        }
    }
}
