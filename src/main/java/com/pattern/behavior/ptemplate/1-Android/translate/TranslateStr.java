package translate;

/**
 * Created by Administrator on 2018/4/10.
 */

public class TranslateStr extends ATranslate {
    public String FILE_XML_STR = "string.xml";

    @Override
    void setFileXMLName() {
        this.fileXmlName = FILE_XML_STR;
    }

    @Override
    String translate(WorkBook sheet) {
        getAndroidStrByKeyValue("", "");
        return "";
    }

    @Override
    String getLanguage() {
        return "";
    }

    String getAndroidStrByKeyValue(String key, String value) {
        if (isContainDiagonal(value)) {
            value = replaceValue(value);
        }
        return "";
    }

}
