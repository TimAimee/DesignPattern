package translate;

/**
 * Created by Administrator on 2018/4/10.
 */

public abstract class ATranslate {
    protected String fileXmlName;
    private String inputPath, outputPath;
    private String DIR_RES = "res";
    FileUtil fileUtil;

    public ATranslate() {
        this.fileUtil = new FileUtil();
        setFileXMLName();
    }

    abstract void setFileXMLName();

    abstract String translate(WorkBook sheet);

    abstract String getLanguage();

    public void doTranslate() {
        WorkBook sheet = openExcel(inputPath);
        String result = translate(sheet);
        String language = getLanguage();
        saveXMLByLanguage(result, language, outputPath);
    }

    protected boolean isContainDiagonal(String str) {
        return false;
    }


    protected String replaceValue(String str) {
        return "";
    }

    protected WorkBook openExcel(String inputPath) {

        return new WorkBook();
    }

    private void saveXML(String result, String outputPath) {
        fileUtil.isDirExit(outputPath);
        fileUtil.creatDir(outputPath);
        fileUtil.isFileExits(outputPath);
        fileUtil.createFile(outputPath);
        fileUtil.saveToFile(result, outputPath);
    }

    private void saveXMLByLanguage(String result, String language, String outputPath) {
        saveXML(result, outputPath);
    }

    private String getDirByLanguage(String languageStr) {
        return "";
    }

    private String getDateTime() {
        return "";
    }
}
