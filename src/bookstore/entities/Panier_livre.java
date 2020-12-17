package bookstore.entities;

import bookstore.services.PanierService;
import bookstore.viewsControllers.GererPanierController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Panier_livre extends Panier{

private int id_panier;
private int id_user;
private int id_comm;
private float prix;
private String titre;
private float somme_ajoute ;
private TextField quantite_ajouter;
private Button supprimer;
private Button update;

    


  public Panier_livre() {
    }

    public Button getSupprimer() {
        return supprimer;
    }

    public void setSupprimer(Button supprimer) {
        this.supprimer = supprimer;
    }

    public float getSomme_ajoute() {
        return somme_ajoute;
    }

    public void setSomme_ajoute(float somme_ajouté) {
        this.somme_ajoute = somme_ajouté;
    }

    public TextField getQuantite_ajouter() {
        return quantite_ajouter;
    }

    public void setQuantite_ajouter(TextField quantite_ajouter) {
        this.quantite_ajouter = quantite_ajouter;
    }

    public Panier_livre( int id_user, int id_comm, float somme_ajoute, String quantite_ajouter) {
        this.id_user = id_user;
        this.id_comm = id_comm;
        this.somme_ajoute = somme_ajoute;
        this.quantite_ajouter = new TextField(quantite_ajouter);
        this.supprimer = new Button ("supprimer");
         supprimer.setOnAction(new EventHandler<ActionEvent>(){

                @Override
                public void handle(ActionEvent t) {

                        GererPanierController p = new GererPanierController();
                        p.supprimer(id_comm);
                   }
            });
         
         this.update = new Button( "update");
                 update.setOnAction(new EventHandler<ActionEvent>(){

                @Override
                public void handle(ActionEvent t) {

                        GererPanierController p = new GererPanierController();
                        
                   }
            });
    }
    
    
    

    public Panier_livre(int id_panier, int id_user, int id_comm, float somme_ajoute, String quantite_ajouter, String titre, float prix) {
        this.id_panier = id_panier;
        this.id_user = id_user;
        this.id_comm = id_comm;
        this.prix= prix;
        this.titre=titre;
        this.somme_ajoute = somme_ajoute;
        this.quantite_ajouter = new TextField(quantite_ajouter);
         this.supprimer = new Button ("supprimer");
          supprimer.setOnAction(new EventHandler<ActionEvent>(){

                @Override
                public void handle(ActionEvent t) {
                  
                	/*Panier_livre currentPerson = (Panier_livre) ButtonCell.this.getTableView().getItems().get(ButtonCell.this.getIndex());
                	data.remove(currentPerson);*/
                        PanierService p = new PanierService();
                        p.supprimer(id_comm);
                        
                        
                }
            });
          this.update = new Button( "update");
                 update.setOnAction(new EventHandler<ActionEvent>(){

                @Override
                public void handle(ActionEvent t) {

                        GererPanierController p = new GererPanierController();
                        
                   }
            });
    }
    
    
    public Panier_livre(float prix, String titre) {
       
        this.prix = prix;
        this.titre = titre;
        this.supprimer = supprimer;
         this.supprimer = new Button ("supprimer");
          supprimer.setOnAction(new EventHandler<ActionEvent>(){

                @Override
                public void handle(ActionEvent t) {
                  
                	/*Panier_livre currentPerson = (Panier_livre) ButtonCell.this.getTableView().getItems().get(ButtonCell.this.getIndex());
                	data.remove(currentPerson);*/
                        PanierService p = new PanierService();
                        p.supprimer(id_comm);
                        
                        
                }
            });
          this.update = new Button( "update");
                 update.setOnAction(new EventHandler<ActionEvent>(){

                @Override
                public void handle(ActionEvent t) {

                        GererPanierController p = new GererPanierController();
                        
                   }
            });
    }
   
    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Button getUpdate() {
        return update;
    }

    public void setUpdate(Button update) {
        this.update = update;
    }
    
  
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id_panier;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Panier_livre other = (Panier_livre) obj;
        if (this.id_panier != other.id_panier) {
            return false;
        }
        if ((this.id_user != other.id_user)&&(this.id_comm != other.id_comm)) {
            return false;
        }
       
        return true;
    }

    @Override
    public String toString() {
        return "Panier{" + "id_panier=" + id_panier + ", id_user=" + id_user + ", id_comm=" + id_comm + ", somme=" + somme_ajoute + ", quantité ajouté"+ quantite_ajouter+'}';
    }

    public int getId_panier() {
        return id_panier;
    }

    public void setId_panier(int id_panier) {
        this.id_panier = id_panier;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_comm() {
        return id_comm;
    }

    public void setId_comm(int id_comm) {
        this.id_comm = id_comm;
    }

    @Override
    public void retirerLivre(Livre b) {
         PanierService ps = new PanierService();
        ps.supprimer(this.id_comm);
    }

    @Override
    public int modifierQuantité(ArrayList<Livre> list) {
       
        PanierService ps = new PanierService();
 /*   try {
        ps.modifier(this.quantite_ajouter,this.id_comm);
    } catch (SQLException ex) {
        Logger.getLogger(Panier_livre.class.getName()).log(Level.SEVERE, null, ex);
    }*/
        return ps.afficherQ();
    
    }

   

}