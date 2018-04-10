package translate;

/**
 * Created by Administrator on 2018/4/10.
 */

public class TranslateArr extends ATranslate {
    public String FILE_XML_ARR_GLOASS = "arrays_glossary.xml";


    @Override
    void setFileXMLName() {
        this.fileXmlName = FILE_XML_ARR_GLOASS;
    }


    @Override
    String translate(WorkBook sheet) {
        if (isItem("")) {
            getAndroidItemByKeyValue("", "");
        } else {
            String Key = getReallyKey("");
            getAndroidArrayByKeyValue("", "");
        }
        return "";
    }

    @Override
    String getLanguage() {
        return "";
    }

    String getAndroidItemByKeyValue(String key, String value) {
        if (isContainDiagonal(value)) {
            value = replaceValue(value);
        }
        return "";
    }

    String getAndroidArrayByKeyValue(String key, String value) {
        if (isContainDiagonal(value)) {
            value = replaceValue(value);
        }
        return "";
    }

    boolean isItem(String key) {
        return false;
    }

    String getReallyKey(String key) {
        return "";
    }


}
