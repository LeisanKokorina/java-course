package ru.itpark;

public class DocumentsArray {
    private static int count  = 0;

    static void showMenu(){
        System.out.println("МЕНЮ:");
        System.out.println("1. Показать документы");
        System.out.println("2. Добавить документ");
        System.out.println("3. Удалить документ");
        System.out.println("4. Редактировать документ");
        System.out.println("5. Выход");
        }
        static void showdocumentsArray(Document arrayDocuments[]){
            for (int i = 0; i < arrayDocuments.length; i++) {

                String lineToOut = arrayDocuments[i] == null ? "_______" : "Документ #"+ (i+1);
                System.out.println(i + ": " + lineToOut);
            }
        }

        static void addDocument(Document arrayDocuments[], Document document[]) {
            for (int i = 0; i < arrayDocuments.length; i++) {
                if (count >= arrayDocuments.length) {
                    System.err.println("Нет места");
                    break;
                }
                if (arrayDocuments[i] == null && count < arrayDocuments.length) {
                    document[i] = new Document();
                    arrayDocuments[i] = document[i];
                    count++;
                    break;
                }
            }
        }
        static void deleteDocument(Document arrayDocuments[], int numberForDelete){
            for (int i = numberForDelete; i < arrayDocuments.length - 1;i++){
                arrayDocuments[i] = arrayDocuments[i + 1];
            }
            arrayDocuments[arrayDocuments.length - 1] = null;
            count--;
        }

}
