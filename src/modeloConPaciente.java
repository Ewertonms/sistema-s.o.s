
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class modeloConPaciente extends AbstractTableModel{
    
    private List<dadosConPaciente> conPac = new ArrayList<>();
    private String[] colun = {"Médico","Especialidade","Dia","Turno"};

     @Override
    public String getColumnName(int column) {
        return colun[column]; 
    }
    
    @Override
    public int getRowCount() {
        return conPac.size();
    }

    @Override
    public int getColumnCount() {
        return colun.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return conPac.get(linha).getMedico();
            case 1:
                return conPac.get(linha).getEspec();
            case 2:
                return conPac.get(linha).getDia();
            case 3:
                return conPac.get(linha).getTurno();
        }
        
        return null;
        
    }
     public void addRow(dadosConPaciente c){
        this.conPac.add(c);
        this.fireTableDataChanged();
    }
}
