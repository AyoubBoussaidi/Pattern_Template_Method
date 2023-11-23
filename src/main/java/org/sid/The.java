package org.sid;

class The extends Boisson {
    @Override
    protected void preparerIngredient() {
        System.out.println("Infusion du thé");
    }

    @Override
    protected void ajouterSupplements() {
        System.out.println("Ajout de citron");
    }
}
