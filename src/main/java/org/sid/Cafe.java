package org.sid;

class Cafe extends Boisson {
    @Override
    protected void preparerIngredient() {
        System.out.println("Infusion du café moulu");
    }

    @Override
    protected void ajouterSupplements() {
        System.out.println("Ajout de sucre et de lait");
    }
}