package ru.itpark;

import com.sun.org.apache.xpath.internal.SourceTree;


import java.io.IOException;
import java.util.Scanner;
 class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько документов может быть создано?");
        int docSize = scanner.nextInt();
        Document arrayDocuments[] = new Document[docSize];
        Document[] document =  new Document[docSize];
        while (true){
            DocumentsArray.showMenu();
            int command = scanner.nextInt();
            switch (command){
                case 1: {
                    DocumentsArray.showdocumentsArray(arrayDocuments);
                }
                break;
                case 2: {
                    DocumentsArray.addDocument(arrayDocuments, document);
                }
                break;
                case 3: {
                    System.out.println("Какой документ необходимо удалить?");
                    int numberForDelete = scanner.nextInt();
                    DocumentsArray.deleteDocument(arrayDocuments, numberForDelete);
                }
                break;
                case 4:{
                    System.out.println("Какой документ необходимо редактировать?");
                    int numberForEdit = scanner.nextInt();
                    if (numberForEdit > arrayDocuments.length - 1){
                        System.out.println("Такого документа не существует!");
                    }
                    else {
                        MainForDocuments.workWithDocument(arrayDocuments[numberForEdit]);
                    }
                }
                break;
                case 5: {
                    System.exit(0);
                }
            }

        }
    }

    }
//}

