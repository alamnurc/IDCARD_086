/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws.b.id.card;

/**
 *
 * @author alamnurcahaya
 */
public class DataKTP {
    public String name;
    public String dateofbirth;
    private String photo;
    public DataKTP() {
        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
            
    public String getDateofBirth(){
        return dateofbirth;
    }
    public void setDateofBirth(String dateofbirth){
        this.dateofbirth = dateofbirth;
    }
    
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo){
        this.photo = photo;
    }
}