package application;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class App {

    public static void main(String[] args) {
        int contadorAcimaMedia = 0;
        double totalFaturamento = 0;
        int diasComFaturamento = 0;
        double media = 0;
        double maiorValor = 0; 
        double menorValor = 0; 
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            File file = new File("src/resources/dados.xml");
            Document doc = builder.parse(file);
            
            NodeList lista = doc.getElementsByTagName("row");
            
            for (int i = 0; i < lista.getLength(); i++) {
                double valor = Double.parseDouble(lista.item(i).getChildNodes().item(3).getTextContent());
                
                if (valor > 0) {
                    totalFaturamento += valor;
                    diasComFaturamento++;
                    
                    if (valor > maiorValor) {
                        maiorValor = valor;
                    }
                    
                    if (valor < menorValor || menorValor == 0) {
                        menorValor = valor;
                    }
                }
            }
            
            if (diasComFaturamento > 0) {
                media = totalFaturamento / diasComFaturamento;
            }
            
            for (int i = 0; i < lista.getLength(); i++) {
                double valor = Double.parseDouble(lista.item(i).getChildNodes().item(3).getTextContent());
                if (valor > media) {
                    contadorAcimaMedia++;
                }
            }
            
            System.out.println("Média: " + media);
            System.out.println("Menor valor faturado: " + (menorValor == -1 ? "Nenhum valor positivo encontrado" : menorValor));
            System.out.println("Maior valor faturado: " + maiorValor);
            System.out.println("Quantidade de dias que o valor ultrapassou a média: " + contadorAcimaMedia);
            
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}

