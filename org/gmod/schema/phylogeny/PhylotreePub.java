package org.gmod.schema.phylogeny;
// Generated Aug 31, 2006 4:02:18 PM by Hibernate Tools 3.2.0.beta7


import org.gmod.schema.pub.Pub;










/**
 * PhylotreePub generated by hbm2java
 */


public class PhylotreePub  implements java.io.Serializable {

    // Fields    

     private int phylotreePubId;
     private Phylotree phylotree;
     private Pub pub;

     // Constructors

    /** default constructor */
    public PhylotreePub() {
    	// Deliberately empty default constructor
    }

    /** full constructor */
    public PhylotreePub(int phylotreePubId, Phylotree phylotree, Pub pub) {
       this.phylotreePubId = phylotreePubId;
       this.phylotree = phylotree;
       this.pub = pub;
    }
   
    // Property accessors

    

    public int getPhylotreePubId() {
        return this.phylotreePubId;
    }
    
    public void setPhylotreePubId(int phylotreePubId) {
        this.phylotreePubId = phylotreePubId;
    }

    

    public Phylotree getPhylotree() {
        return this.phylotree;
    }
    
    public void setPhylotree(Phylotree phylotree) {
        this.phylotree = phylotree;
    }

    

    public Pub getPub() {
        return this.pub;
    }
    
    public void setPub(Pub pub) {
        this.pub = pub;
    }




}


