import com.google.gson.Gson;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        Gson gson = new Gson();

        Persona p1 = new Persona();
        p1.setNombre("Jean Jacques");
        p1.setEdad(19);
        p1.setDireccion("Imperial Ice Skating Kingdom");

        //CODIGO PARA CONVERTIR OBJETO - JSON

        //To convert to Json as a String
        String jsonInString = gson.toJson(p1);
        System.out.println("Codigo JSON:");
        System.out.println(jsonInString);

        //To convert to Json file
        try (FileWriter writer = new FileWriter("D:\\personap1.json")){
            gson.toJson(p1,writer);
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println();

        //CODIGO PARA CONVERTIR OBJETO - XML
        try {
            //Crear jaxbContext
            JAXBContext jaxbContext = JAXBContext.newInstance(Persona.class);
            //Getting Marshaller object
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            //For Prettyprinted output
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);


            //Aqui se escriben los files y se muestra en consola los XML

            //Writing onto the file
            jaxbMarshaller.marshal(p1,new File("D:\\personap1X.xml"));
            //Output console
            System.out.println("Codigo XML:");
            jaxbMarshaller.marshal(p1,System.out);
        } catch (JAXBException e1){
            e1.printStackTrace();
        }



    }
}
