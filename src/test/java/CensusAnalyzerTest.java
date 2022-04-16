import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyzerTest {

    private static final String INDIA_CENSUS_CSV_PATH = "C:\\Users\\DELL\\IdeaProjects\\indian-state-census-analyser-problem\\src\\main\\IndiaStateCensusData.csv";
    private static final String INDIA_CENSUS_CSV_WRONG_FILETYPE = "C:\\Users\\DELL\\IdeaProjects\\indian-state-census-analyser-problem\\src\\main\\IndiaStateCensusData.csv";;

    //UseCase 1.1 Happy
    @Test
    public void givenIndianCensusCSVFileReturnsCorrectRecords() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();

        try {
            int numOfRecord = censusAnalyzer.loadIndiaCensusData(INDIA_CENSUS_CSV_PATH);
            Assert.assertEquals(29, numOfRecord);

        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }

    //UseCase 1.2 Sad
    @Test
    public void givenIndianCensusCSVFileReturnsInCorrectRecords() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();

        try {
            int numOfRecord = censusAnalyzer.loadIndiaCensusData(INDIA_CENSUS_CSV_PATH);
            Assert.assertEquals(30, numOfRecord);

        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }

    //UseCase 1.3 Path is correct but file type is incorrect
    @Test
    public void givenIndianCensusCSVFileReturnsInCorrecFileType_But_PathShouldBeCorrect() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();
        try {
            int numOfRecord = censusAnalyzer.loadIndiaCensusData(INDIA_CENSUS_CSV_WRONG_FILETYPE);
            Assert.assertEquals(29, numOfRecord);
        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }
}
