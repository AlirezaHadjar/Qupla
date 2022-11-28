import lexer.vocabulary;
import org.antlr.v4.runtime.*;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws IOException {

        String text = "";
        try {
            String currentDirectory = System.getProperty("user.dir");
            String inputFileName = currentDirectory+"/src/"+ "InputFile.QUPLA";
            text = Files.readString(Paths.get(inputFileName)).trim();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        CharStream in = CharStreams.fromString(text);
        vocabulary lexer = new vocabulary(in);

        while (!lexer._hitEOF) {
            Token token = lexer.nextToken();
            int type = token.getType();
            if (type == Token.EOF) break;

            String typeName = vocabulary.VOCABULARY.getSymbolicName(type);
            System.out.println(typeName);
        }

    }
}