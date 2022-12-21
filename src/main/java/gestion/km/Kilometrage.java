package gestion.km;

import gestion.gdao.inherit.*;

import java.util.Date;

import gestion.gdao.genericdao.*;

@TableName(value = "kilometrage")
public class Kilometrage extends DBModel {

    @ColumnName(pk = true)
    String idavion;
    @ColumnName()
    Date daty;
    @ColumnName()
    Double debut;
    @ColumnName()
    Double fin;
    
    public Date getDaty() {
        return daty;
    }

    public void setDaty(Date daty) {
        this.daty = daty;
    }

    public Double getDebut() {
        return debut;
    }

    public void setDebut(Double debut) {
        this.debut = debut;
    }

    public Double getFin() {
        return fin;
    }

    public void setFin(Double fin) {
        this.fin = fin;
    }

    public String getIdavion() {
        return idavion;
    }

    public void setIdavion(String idavion) {
        this.idavion = idavion;
    }
}
