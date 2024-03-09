## **Travail demandé** :
*implémenter les méthodes printOnlyBooks et printOnlyCDs en s’appuyant sur le  design  pattern  « Visitor »*

## Proposition de solution : 

Une Interface ItemVisitor avec deux classes qui l'implémentent : CDPrinter et BookPrinter ; ajout de la méthode *accept visit* aux 
classes Item (Book et CD)

### Fonctionnement

Pour imprimer tous les books, on parcourt la liste des Item et on fait visiter un BookPrinter : Les Books sont imprimés, 
et les CD sont ignorés

