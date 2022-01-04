/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps.project.main.view.form.component.table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import ps.project.domain.Customer;
import ps.project.domain.LegalPerson;
import ps.project.domain.NaturalPerson;

/**
 *
 * @author saska
 */
public class CustomerTableModel extends AbstractTableModel{
    private String [] columnNames={"Id","Ime i Prezime","Naziv","Email","Poštanski  broj","Grad"};
    private final List<Customer> customers;

    

    public CustomerTableModel(List<Customer> customers, List<NaturalPerson> naturalPersons, List<LegalPerson> legalPersons ) {
        this.customers = customers;
       
    }

    @Override
    public int getRowCount() {
        //koliko redova ima tabela
        if(customers==null) return 0;
        return customers.size();
    }

    @Override
    public String getColumnName(int column) {
        if(column>columnNames.length) return "n/a";
        return columnNames[column];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    /*@Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //vrati mi vrednost iz datog polja
        Customer customer= customers.get(rowIndex);
       
        switch(columnIndex){
            case 0: return customer.getId();
            case 1: return customer.getFirstName();
            case 2: return customer.getLastName();
            case 3: return customer.getAddress();
            case 4: return customer.getPhoneNumber();
            case 5: return customer.getEmail();
            case 6: return customer.getPostalCode();
            
            default: return "n/a";
        }
         
    }*/

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
