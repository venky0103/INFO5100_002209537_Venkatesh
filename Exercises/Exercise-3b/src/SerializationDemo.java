import java.io.*;

public class SerializationDemo {

    public static void serialize(Shape shape, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(shape);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T deserialize(String filename) throws Exception {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (T) in.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
