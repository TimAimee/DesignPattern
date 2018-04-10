package translate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/10.
 */

public class WorkBook {
    private List<WorkSheet> workSheetList;

    public List<WorkSheet> openExecl(String path) {
        return new ArrayList<WorkSheet>();
    }

    public WorkSheet getSheet(int index) {
        return workSheetList.get(index);
    }

    class WorkSheet {
        public Cell getCell(int row, int column) {
            return new Cell();
        }

        public int getMaxColumn() {
            return 0;
        }

        public int getMaxRow() {
            return 0;
        }

        public List<Cell> getAllCell(String path) {
            return new ArrayList<>(15);
        }

        class Cell {
            public String getKey() {
                return "";
            }

            public String getValue() {
                return "";
            }
        }
    }


}
