/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorzmiprojekt;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Firstech
 */
public class MyTable extends DefaultTableModel {
    int columnDisabled=4;
    public MyTable(int columnDisabled){
        super();
        this.columnDisabled = columnDisabled;
    }
    
    @Override
    public boolean isCellEditable(int row, int column){
        if(column == columnDisabled)
            return false;
        else
            return true;
    }
}
