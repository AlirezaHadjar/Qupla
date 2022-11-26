import lexer.vocabulary;
import org.antlr.v4.runtime.*;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws IOException {

        String text = "";
        try {
            String currentDirectory = System.getProperty("user.dir");
            String inputFileName = currentDirectory+"/src/"+ "InputFile.QUPLA";
            text = new String(Files.readAllBytes(Paths.get(inputFileName)), StandardCharsets.UTF_8);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

//        String text = "Bool ali = false ;";
        CharStream in = CharStreams.fromString(text);
        vocabulary lexer = new vocabulary(in);

        while (!lexer._hitEOF) {
            Token token = lexer.nextToken();
            int type = token.getType();
            String typeName = lexer.VOCABULARY.getSymbolicName(type);
            System.out.println(typeName);
        }

    }
}