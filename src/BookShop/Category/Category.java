package BookShop.Category;

import BookShop.Book.*;
import BookShop.Login.AppLogin;
import BookShop.Methods.FilterJtable;
import BookShop.Methods.GetConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public final class Category extends javax.swing.JPanel 
{
    Vector vectorThemesAndSubthemes = new Vector();
    JLabel label = new JLabel();
    String name = null;
    String parent = null;
    
    public Category() 
    {
        initComponents();
        tbl_A.setModel(initTableA());
        tbl_A.setModel(initTableB());
        tbl_A.setModel(initTableC());
        tbl_A.setModel(initTableD());
        tbl_A.setModel(initTableE());
        tbl_A.setModel(initTableF());
        tbl_A.setModel(initTableG());
        tbl_A.setModel(initTableH());
        tbl_A.setModel(initTableI());
        tbl_A.setModel(initTableJ());
        tbl_A.setModel(initTableK());
        tbl_A.setModel(initTableL());
        tbl_A.setModel(initTableM());
        tbl_A.setModel(initTableN());
        tbl_A.setModel(initTableO());
        tbl_A.setModel(initTableP());
        tbl_A.setModel(initTableQ());
        tbl_A.setModel(initTableR());
        tbl_A.setModel(initTableS());
        tbl_A.setModel(initTableT());
        tbl_A.setModel(initTableU());
        tbl_A.setModel(initTableV());
        tbl_A.setModel(initTableW());
        tbl_A.setModel(initTableX());
        tbl_A.setModel(initTableY());
        tbl_A.setModel(initTableZ());
        
        tableSortFilter();
        
        panel_Consult.setVisible(true);
    }

    public DefaultTableModel initTableA() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("A");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("A")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableB() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("B");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("B")) vectorList.add(object);
        }
            
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableC() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("C");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("C")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableD() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("D");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("D")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableE() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("E");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("E")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableF() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("F");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("F")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableG() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("G");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("G")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableH() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("H");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("H")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableI() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("I");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("I")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableJ() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("J");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("J")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableK() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("K");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("K")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableL() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("L");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("L")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableM() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("M");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("M")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableN() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("N");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("N")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableO() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("O");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("O")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableP() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("P");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("P")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableQ() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("Q");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("Q")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableR() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("R");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("R")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableS() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("S");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("S")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableT() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("T");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("T")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableU() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("U");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("U")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableV() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("V");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("V")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableW() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("W");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("W")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableX() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("X");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("X")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableY() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("Y");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("Y")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    public DefaultTableModel initTableZ() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("Z");
        Vector vectorList = new Vector();
        
        for (Object object : getThemesAndSubthemes()) {
            if (((String) object).startsWith("Z")) vectorList.add(object);
        }
        
        return new DefaultTableModel(vectorList, vectorTitle) {
            boolean[] canEdit = new boolean [] {
                true
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    private Vector getThemesAndSubthemes() {
        String query =  "SELECT [ThemeLabel] FROM [BookShop].[dbo].[THEME]" 
            + " UNION ALL"
            + " SELECT [ThemeLabel] FROM [BookShop].[dbo].[THEME]";
        
        // Fills vector with themes
        try (  
            Statement statement = new AppLogin().simpleConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ) {
            
            while (resultSet.next()) {
                ThemesAndSubthemes theme = new ThemesAndSubthemes(
                        resultSet.getString("ThemeLabel")
                );
                vectorThemesAndSubthemes.add(theme.getVector());
            }
            
            // Sort in alphabetical order
            Collections.sort(vectorThemesAndSubthemes);
            
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vectorThemesAndSubthemes;
    }
    
    public void tableSortFilter() {
        TableRowSorter<TableModel> rowSorterA = new TableRowSorter<>(tbl_A.getModel());
        TableRowSorter<TableModel> rowSorterB = new TableRowSorter<>(tbl_B.getModel());
        TableRowSorter<TableModel> rowSorterC = new TableRowSorter<>(tbl_C.getModel());
        TableRowSorter<TableModel> rowSorterD = new TableRowSorter<>(tbl_D.getModel());
        TableRowSorter<TableModel> rowSorterE = new TableRowSorter<>(tbl_E.getModel());
        TableRowSorter<TableModel> rowSorterF = new TableRowSorter<>(tbl_F.getModel());
        TableRowSorter<TableModel> rowSorterG = new TableRowSorter<>(tbl_G.getModel());
        TableRowSorter<TableModel> rowSorterH = new TableRowSorter<>(tbl_H.getModel());
        TableRowSorter<TableModel> rowSorterI = new TableRowSorter<>(tbl_I.getModel());
        TableRowSorter<TableModel> rowSorterJ = new TableRowSorter<>(tbl_J.getModel());
        TableRowSorter<TableModel> rowSorterK = new TableRowSorter<>(tbl_K.getModel());
        TableRowSorter<TableModel> rowSorterL = new TableRowSorter<>(tbl_L.getModel());
        TableRowSorter<TableModel> rowSorterM = new TableRowSorter<>(tbl_M.getModel());
        TableRowSorter<TableModel> rowSorterN = new TableRowSorter<>(tbl_N.getModel());
        TableRowSorter<TableModel> rowSorterO = new TableRowSorter<>(tbl_O.getModel());
        TableRowSorter<TableModel> rowSorterP = new TableRowSorter<>(tbl_P.getModel());
        TableRowSorter<TableModel> rowSorterQ = new TableRowSorter<>(tbl_Q.getModel());
        TableRowSorter<TableModel> rowSorterR = new TableRowSorter<>(tbl_R.getModel());
        TableRowSorter<TableModel> rowSorterS = new TableRowSorter<>(tbl_S.getModel());
        TableRowSorter<TableModel> rowSorterT = new TableRowSorter<>(tbl_T.getModel());
        TableRowSorter<TableModel> rowSorterU = new TableRowSorter<>(tbl_U.getModel());
        TableRowSorter<TableModel> rowSorterV = new TableRowSorter<>(tbl_V.getModel());
        TableRowSorter<TableModel> rowSorterW = new TableRowSorter<>(tbl_W.getModel());
        TableRowSorter<TableModel> rowSorterX = new TableRowSorter<>(tbl_X.getModel());
        TableRowSorter<TableModel> rowSorterY = new TableRowSorter<>(tbl_Y.getModel());
        TableRowSorter<TableModel> rowSorterZ = new TableRowSorter<>(tbl_Z.getModel());
        
        tbl_A.setRowSorter(rowSorterA);
        tbl_B.setRowSorter(rowSorterB);
        tbl_C.setRowSorter(rowSorterC);
        tbl_D.setRowSorter(rowSorterD);
        tbl_E.setRowSorter(rowSorterE);
        tbl_F.setRowSorter(rowSorterF);
        tbl_G.setRowSorter(rowSorterG);
        tbl_H.setRowSorter(rowSorterH);
        tbl_I.setRowSorter(rowSorterI);
        tbl_J.setRowSorter(rowSorterJ);
        tbl_K.setRowSorter(rowSorterK);
        tbl_L.setRowSorter(rowSorterL);
        tbl_M.setRowSorter(rowSorterM);
        tbl_N.setRowSorter(rowSorterN);
        tbl_O.setRowSorter(rowSorterO);
        tbl_P.setRowSorter(rowSorterP);
        tbl_Q.setRowSorter(rowSorterQ);
        tbl_R.setRowSorter(rowSorterR);
        tbl_S.setRowSorter(rowSorterS);
        tbl_T.setRowSorter(rowSorterT);
        tbl_U.setRowSorter(rowSorterU);
        tbl_V.setRowSorter(rowSorterV);
        tbl_W.setRowSorter(rowSorterW);
        tbl_X.setRowSorter(rowSorterX);
        tbl_Y.setRowSorter(rowSorterY);
        tbl_Z.setRowSorter(rowSorterZ);
        
        jTextField1.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                String string = jTextField1.getText();
                
                if (string.trim().length() == 0) {
                    rowSorterA.setRowFilter(null);
                    rowSorterB.setRowFilter(null);
                    rowSorterC.setRowFilter(null);
                    rowSorterD.setRowFilter(null);
                    rowSorterE.setRowFilter(null);
                    rowSorterF.setRowFilter(null);
                    rowSorterG.setRowFilter(null);
                    rowSorterH.setRowFilter(null);
                    rowSorterI.setRowFilter(null);
                    rowSorterJ.setRowFilter(null);
                    rowSorterK.setRowFilter(null);
                    rowSorterL.setRowFilter(null);
                    rowSorterM.setRowFilter(null);
                    rowSorterN.setRowFilter(null);
                    rowSorterO.setRowFilter(null);
                    rowSorterP.setRowFilter(null);
                    rowSorterQ.setRowFilter(null);
                    rowSorterR.setRowFilter(null);
                    rowSorterS.setRowFilter(null);
                    rowSorterT.setRowFilter(null);
                    rowSorterU.setRowFilter(null);
                    rowSorterV.setRowFilter(null);
                    rowSorterW.setRowFilter(null);
                    rowSorterX.setRowFilter(null);
                    rowSorterY.setRowFilter(null);
                    rowSorterZ.setRowFilter(null);
                } else {
                    rowSorterA.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterB.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterC.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterD.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterE.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterF.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterG.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterH.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterI.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterJ.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterK.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterL.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterM.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterN.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterO.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterP.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterQ.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterR.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterS.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterT.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterU.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterV.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterW.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterX.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterY.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterZ.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String string = jTextField1.getText();
                
                if (string.trim().length() == 0) {
                    rowSorterA.setRowFilter(null);
                    rowSorterB.setRowFilter(null);
                    rowSorterC.setRowFilter(null);
                    rowSorterD.setRowFilter(null);
                    rowSorterE.setRowFilter(null);
                    rowSorterF.setRowFilter(null);
                    rowSorterG.setRowFilter(null);
                    rowSorterH.setRowFilter(null);
                    rowSorterI.setRowFilter(null);
                    rowSorterJ.setRowFilter(null);
                    rowSorterK.setRowFilter(null);
                    rowSorterL.setRowFilter(null);
                    rowSorterM.setRowFilter(null);
                    rowSorterN.setRowFilter(null);
                    rowSorterO.setRowFilter(null);
                    rowSorterP.setRowFilter(null);
                    rowSorterQ.setRowFilter(null);
                    rowSorterR.setRowFilter(null);
                    rowSorterS.setRowFilter(null);
                    rowSorterT.setRowFilter(null);
                    rowSorterU.setRowFilter(null);
                    rowSorterV.setRowFilter(null);
                    rowSorterW.setRowFilter(null);
                    rowSorterX.setRowFilter(null);
                    rowSorterY.setRowFilter(null);
                    rowSorterZ.setRowFilter(null);
                } else {
                    rowSorterA.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterB.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterC.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterD.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterE.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterF.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterG.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterH.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterI.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterJ.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterK.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterL.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterM.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterN.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterO.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterP.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterQ.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterR.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterS.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterT.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterU.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterV.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterW.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterX.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterY.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                    rowSorterZ.setRowFilter(RowFilter.regexFilter("(?i)" + string));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            private String RowFilter(String i) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbl_B1 = new javax.swing.JTable();
        panel_Consult = new javax.swing.JPanel();
        Up = new javax.swing.JPanel();
        lbl_TitleManageBook = new javax.swing.JLabel();
        Left_SideBar = new javax.swing.JPanel();
        lbl_TitleBook = new javax.swing.JLabel();
        sep_Customer = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_A = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_ValidateEdit1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_B = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_C = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_D = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_E = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_F = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbl_G = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tbl_H = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        tbl_I = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        tbl_J = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        tbl_L = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        tbl_K = new javax.swing.JTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        tbl_N = new javax.swing.JTable();
        jScrollPane17 = new javax.swing.JScrollPane();
        tbl_O = new javax.swing.JTable();
        jScrollPane18 = new javax.swing.JScrollPane();
        tbl_P = new javax.swing.JTable();
        jScrollPane19 = new javax.swing.JScrollPane();
        tbl_M = new javax.swing.JTable();
        jScrollPane20 = new javax.swing.JScrollPane();
        tbl_Q = new javax.swing.JTable();
        jScrollPane21 = new javax.swing.JScrollPane();
        tbl_R = new javax.swing.JTable();
        jScrollPane22 = new javax.swing.JScrollPane();
        tbl_S = new javax.swing.JTable();
        jScrollPane23 = new javax.swing.JScrollPane();
        tbl_T = new javax.swing.JTable();
        jScrollPane24 = new javax.swing.JScrollPane();
        tbl_X = new javax.swing.JTable();
        jScrollPane25 = new javax.swing.JScrollPane();
        tbl_W = new javax.swing.JTable();
        jScrollPane26 = new javax.swing.JScrollPane();
        tbl_Y = new javax.swing.JTable();
        jScrollPane27 = new javax.swing.JScrollPane();
        tbl_U = new javax.swing.JTable();
        jScrollPane28 = new javax.swing.JScrollPane();
        tbl_Z = new javax.swing.JTable();
        jScrollPane29 = new javax.swing.JScrollPane();
        tbl_V = new javax.swing.JTable();
        btn_ValidateEdit2 = new javax.swing.JButton();

        tbl_B1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));

        setLayout(new java.awt.CardLayout());

        panel_Consult.setBackground(new java.awt.Color(242, 242, 242));

        Up.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleManageBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleManageBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleManageBook.setText("MANAGE CATEGORY");

        javax.swing.GroupLayout UpLayout = new javax.swing.GroupLayout(Up);
        Up.setLayout(UpLayout);
        UpLayout.setHorizontalGroup(
            UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManageBook, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UpLayout.setVerticalGroup(
            UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManageBook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Left_SideBar.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Globe_32px.png"))); // NOI18N
        lbl_TitleBook.setText("List of All Categories in Alphabetical Order");

        jScrollPane4.setBorder(null);

        tbl_A.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        tbl_A.setPreferredSize(new java.awt.Dimension(75, 176));
        tbl_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_AMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_A);
        tbl_A.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel2.setText("Search:");

        btn_ValidateEdit1.setBackground(new java.awt.Color(135, 199, 213));
        btn_ValidateEdit1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_ValidateEdit1.setText("Add Category");
        btn_ValidateEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ValidateEdit1ActionPerformed(evt);
            }
        });

        jScrollPane5.setBorder(null);

        tbl_B.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane5.setViewportView(tbl_B);
        tbl_B.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_C.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane6.setViewportView(tbl_C);
        tbl_C.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_D.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane7.setViewportView(tbl_D);
        tbl_D.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_E.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane8.setViewportView(tbl_E);
        tbl_E.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_F.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane9.setViewportView(tbl_F);
        tbl_F.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_G.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane10.setViewportView(tbl_G);
        tbl_G.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_H.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane11.setViewportView(tbl_H);
        tbl_H.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_I.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane12.setViewportView(tbl_I);
        tbl_I.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_J.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane13.setViewportView(tbl_J);
        tbl_J.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_L.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane14.setViewportView(tbl_L);
        tbl_L.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_K.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane15.setViewportView(tbl_K);
        tbl_K.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_N.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane16.setViewportView(tbl_N);
        tbl_N.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_O.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane17.setViewportView(tbl_O);
        tbl_O.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_P.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane18.setViewportView(tbl_P);
        tbl_P.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_M.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane19.setViewportView(tbl_M);
        tbl_M.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_Q.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane20.setViewportView(tbl_Q);
        tbl_Q.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_R.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane21.setViewportView(tbl_R);
        tbl_R.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_S.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane22.setViewportView(tbl_S);
        tbl_S.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_T.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane23.setViewportView(tbl_T);
        tbl_T.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_X.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane24.setViewportView(tbl_X);
        tbl_X.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_W.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane25.setViewportView(tbl_W);
        tbl_W.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_Y.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane26.setViewportView(tbl_Y);
        tbl_Y.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_U.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane27.setViewportView(tbl_U);
        tbl_U.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_Z.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane28.setViewportView(tbl_Z);
        tbl_Z.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tbl_V.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane29.setViewportView(tbl_V);
        tbl_V.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btn_ValidateEdit2.setBackground(new java.awt.Color(135, 199, 213));
        btn_ValidateEdit2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_ValidateEdit2.setText("Edit Category");
        btn_ValidateEdit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ValidateEdit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Left_SideBarLayout = new javax.swing.GroupLayout(Left_SideBar);
        Left_SideBar.setLayout(Left_SideBarLayout);
        Left_SideBarLayout.setHorizontalGroup(
            Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBarLayout.createSequentialGroup()
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_SideBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sep_Customer)
                            .addGroup(Left_SideBarLayout.createSequentialGroup()
                                .addComponent(lbl_TitleBook, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_ValidateEdit1)
                                .addGap(50, 50, 50)
                                .addComponent(btn_ValidateEdit2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Left_SideBarLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Left_SideBarLayout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Left_SideBarLayout.createSequentialGroup()
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Left_SideBarLayout.createSequentialGroup()
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Left_SideBarLayout.createSequentialGroup()
                                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(Left_SideBarLayout.createSequentialGroup()
                                        .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Left_SideBarLayout.createSequentialGroup()
                                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Left_SideBarLayout.setVerticalGroup(
            Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TitleBook)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btn_ValidateEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ValidateEdit2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(sep_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_ConsultLayout = new javax.swing.GroupLayout(panel_Consult);
        panel_Consult.setLayout(panel_ConsultLayout);
        panel_ConsultLayout.setHorizontalGroup(
            panel_ConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ConsultLayout.createSequentialGroup()
                .addGroup(panel_ConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Up, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Left_SideBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_ConsultLayout.setVerticalGroup(
            panel_ConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ConsultLayout.createSequentialGroup()
                .addComponent(Up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Left_SideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(panel_Consult, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ValidateEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ValidateEdit1ActionPerformed
        // Enter category in a JDialog
            name = (String)JOptionPane.showInputDialog(
            this,
            "Enter Category:",
            "Enter Category Dialog",
            JOptionPane.PLAIN_MESSAGE,
            null,
            null,
            null);
            
        if (name.matches("^[a-zA-Z0-9\\. ]+(-[a-zA-Z0-9\\. ]+)?$")) {
            //If a category was returned, 
            if ((name != null) && (name.length() > 0)) {
                // Lists parents in a JDialog
                int i = 0;
                Object[] parents = new Object[getThemesAndSubthemes().size()];
                parents[i] = "None";
                for (i = 1; i < getThemesAndSubthemes().size(); i++) {
                    parents[i] = getThemesAndSubthemes().get(i);
                }
                parent = (String)JOptionPane.showInputDialog(
                this,
                "Enter Parent:",
                "Enter Parent Dialog",
                JOptionPane.PLAIN_MESSAGE,
                null,
                parents,
                parents[0]);

                // Tests whether there is no parent
                if (parent.equals(parents[0])) {                
                    PreparedStatement preparedStatement = null;
                   try {
                        String insert = "INSERT INTO [dbo].[THEME] ([ThemeLabel])\n" 
                        + " VALUES (?)";
                        preparedStatement = new AppLogin().simpleConnection().prepareStatement(insert);
                        preparedStatement.setString(1, name);
                        int result = preparedStatement.executeUpdate();

                        // Compares user inputs with row set data 
                        if (result != 0) {
                            System.out.println("Inserted");
                            panel_Consult.setVisible(true);
                        }
                    } catch (SQLException ex) {
                        setVisible(true);
                        System.out.println("No");
                        Logger.getLogger(AppLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                return;
            }
        } else {
            JOptionPane.showMessageDialog(panel_Consult, "Category Is Too Long", "Category Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_ValidateEdit1ActionPerformed

    private void tbl_AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_AMouseClicked
        
    }//GEN-LAST:event_tbl_AMouseClicked

    private void btn_ValidateEdit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ValidateEdit2ActionPerformed
        String category = JOptionPane.showInputDialog("Enter Category");
   
    }//GEN-LAST:event_btn_ValidateEdit2ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left_SideBar;
    private javax.swing.JPanel Up;
    private javax.swing.JButton btn_ValidateEdit1;
    private javax.swing.JButton btn_ValidateEdit2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_TitleBook;
    private javax.swing.JLabel lbl_TitleManageBook;
    private javax.swing.JPanel panel_Consult;
    private javax.swing.JSeparator sep_Customer;
    private javax.swing.JTable tbl_A;
    private javax.swing.JTable tbl_B;
    private javax.swing.JTable tbl_B1;
    private javax.swing.JTable tbl_C;
    private javax.swing.JTable tbl_D;
    private javax.swing.JTable tbl_E;
    private javax.swing.JTable tbl_F;
    private javax.swing.JTable tbl_G;
    private javax.swing.JTable tbl_H;
    private javax.swing.JTable tbl_I;
    private javax.swing.JTable tbl_J;
    private javax.swing.JTable tbl_K;
    private javax.swing.JTable tbl_L;
    private javax.swing.JTable tbl_M;
    private javax.swing.JTable tbl_N;
    private javax.swing.JTable tbl_O;
    private javax.swing.JTable tbl_P;
    private javax.swing.JTable tbl_Q;
    private javax.swing.JTable tbl_R;
    private javax.swing.JTable tbl_S;
    private javax.swing.JTable tbl_T;
    private javax.swing.JTable tbl_U;
    private javax.swing.JTable tbl_V;
    private javax.swing.JTable tbl_W;
    private javax.swing.JTable tbl_X;
    private javax.swing.JTable tbl_Y;
    private javax.swing.JTable tbl_Z;
    // End of variables declaration//GEN-END:variables
}