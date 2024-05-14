
package modelo;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sanni
 */
public class EncriptadorModelo {
    private static final Map<Character, Character> claveEncriptacion = new HashMap<>();
    static {
        claveEncriptacion.put('a', '@');
        claveEncriptacion.put('b', '8');
        claveEncriptacion.put('c', '(');
        claveEncriptacion.put('d', '|');
        claveEncriptacion.put('e', '3');
        claveEncriptacion.put('f', '#');
        claveEncriptacion.put('g', '9');
        claveEncriptacion.put('h', '[');
        claveEncriptacion.put('i', '!');
        claveEncriptacion.put('j', ']');
        claveEncriptacion.put('k', '<');
        claveEncriptacion.put('l', '|');
        claveEncriptacion.put('m', '{');
        claveEncriptacion.put('n', '^');
        claveEncriptacion.put('o', '0');
        claveEncriptacion.put('p', '%');
        claveEncriptacion.put('q', '9');
        claveEncriptacion.put('r', '|');
        claveEncriptacion.put('s', '$');
        claveEncriptacion.put('t', '+');
        claveEncriptacion.put('u', '}');
        claveEncriptacion.put('v', '|');
        claveEncriptacion.put('w', '/');
        claveEncriptacion.put('x', '%');
        claveEncriptacion.put('y', '`');
        claveEncriptacion.put('z', '2');
        
        //MAYUSCULAS
        claveEncriptacion.put('A', '~');
        claveEncriptacion.put('B', '&');
        claveEncriptacion.put('C', '9');
        claveEncriptacion.put('D', '|');
        claveEncriptacion.put('E', '3');
        claveEncriptacion.put('F', '#');
        claveEncriptacion.put('G', '9');
        claveEncriptacion.put('H', ',');
        claveEncriptacion.put('I', '*');
        claveEncriptacion.put('J', ']');
        claveEncriptacion.put('K', 'v');
        claveEncriptacion.put('L', 'E');
        claveEncriptacion.put('M', '`');
        claveEncriptacion.put('N', '"');
        claveEncriptacion.put('O', ':');
        claveEncriptacion.put('P', '%');
        claveEncriptacion.put('Q', '9');
        claveEncriptacion.put('R', ';');
        claveEncriptacion.put('S', '$');
        claveEncriptacion.put('T', '+');
        claveEncriptacion.put('U', '_');
        claveEncriptacion.put('V', '|');
        claveEncriptacion.put('W', '/');
        claveEncriptacion.put('X', 'n');
        claveEncriptacion.put('Y', 'c');
        claveEncriptacion.put('Z', 's');

        //NUMEROS
        claveEncriptacion.put('0', 'O');
        claveEncriptacion.put('1', '+');
        claveEncriptacion.put('2', '-');
        claveEncriptacion.put('3', '#');
        claveEncriptacion.put('4', '$');
        claveEncriptacion.put('5', '%');
        claveEncriptacion.put('6', 'f');
        claveEncriptacion.put('7', 'e');
        claveEncriptacion.put('8', '2');
        claveEncriptacion.put('9', '$');
        
        //claveEncriptacion.put();
        
    }

    public String encriptar(String contraseña) {
        StringBuilder contraseñaEncriptada = new StringBuilder();
        for (int i = 0; i < contraseña.length(); i++) {
            char caracterOriginal = contraseña.charAt(i);
            if (claveEncriptacion.containsKey(caracterOriginal)) {
                char caracterEncriptado = claveEncriptacion.get(caracterOriginal);
                contraseñaEncriptada.append(caracterEncriptado);
            } else {
                contraseñaEncriptada.append(caracterOriginal);
            }
        }
        return contraseñaEncriptada.toString();
    }

    public String desencriptar(String contraseñaEncriptada) {
        StringBuilder contraseñaOriginal = new StringBuilder();
        for (int i = 0; i < contraseñaEncriptada.length(); i++) {
            char caracterEncriptado = contraseñaEncriptada.charAt(i);
            for (Map.Entry<Character, Character> entry : claveEncriptacion.entrySet()) {
                if (entry.getValue() == caracterEncriptado) {
                    contraseñaOriginal.append(entry.getKey());
                    break;
                }
            }
        }
        return contraseñaOriginal.toString();
    }
}
