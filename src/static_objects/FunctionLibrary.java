package static_objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import abstract_types.Function;

/*
 * Class for Function Library
 * 
 * At the beginning of the game, a player's library is constructed from a library list file,
 * which is formatted as follows:
 * 
 * <Library Name>
 * <\n>
 * <number of function x> <name of function x>
 * <number of function y> <name of function y>
 * <etc...>
 * List terminates with blank line.
 * 
 */

public final class FunctionLibrary {
	private File libraryList;
	private String listName;
	private ArrayList<Function> library;
	
	public void createLibrary(File libList) throws FileNotFoundException{
		library = new ArrayList<Function>();
		libraryList = libList;
		Scanner s = new Scanner(libList);
		listName = s.nextLine();
		s.nextLine();
		String line = s.nextLine();
		boolean endOfList = false;
		while(!endOfList){
			Scanner lineParser = new Scanner(line);
			int numFunc = lineParser.nextInt();
			String funcName = line.substring(2);
			Function f = FunctionHash.getFunction(funcName);
			for(; numFunc > 0; numFunc--){
				if(f != null){
					System.out.println(numFunc);
					library.add(f);
				}
				else
					throw new RuntimeException("Library List contains invalid functions!");
			if(s.hasNextLine())
				line = s.nextLine();
			else
				endOfList = true;
			}
		}
	}
	
	public void shuffle(){
		Collections.shuffle(library);
	}
	
}
