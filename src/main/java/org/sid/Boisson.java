package org.sid;

abstract class Boisson {

    public final void preparer() {
        chaufferEau();
        preparerIngredient();
        verserDansTasse();
        ajouterSupplements();
    }
    private void chaufferEau() {
        System.out.println("Chauffage de l'eau");
    }

    private void verserDansTasse() {
        System.out.println("Verser dans la tasse");
    }

    // Méthodes abstraites spécifiques à chaque boisson
    protected abstract void preparerIngredient();
    protected abstract void ajouterSupplements();
}
