import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String name) {
        String persona = String.format("Hola %s, encantado de verte",name);
        return persona;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "Actualmente es " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1){
            return "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
        }
        else if(conversation.indexOf("Alfred") != -1){
            return "A su servicio. Como desee, naturalmente";
        }
        else{
            return "Bien. Y con eso, me retiraré";
        }
    }
    
	// BONUS NINJA
	// Ver las especificaciones para sobrecargar el método guessGreeting
    // BONUS SENSEI
    // ¡Escribe tu propio método AlfredQuotes usando cualquiera de los métodos String que has aprendido!
}