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
            try {
                Token token = lexer.nextToken();
                int type = token.getType();
                String tokenText = token.getText();
                if (type == Token.EOF) break;
                if (tokenText.length() > 32)
                    throw new RuntimeException("Token length is greater than 32 characters" + " at line " + token.getLine() + " and column " + token.getCharPositionInLine());

                String typeName = vocabulary.VOCABULARY.getSymbolicName(type);
                System.out.println(typeName);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}