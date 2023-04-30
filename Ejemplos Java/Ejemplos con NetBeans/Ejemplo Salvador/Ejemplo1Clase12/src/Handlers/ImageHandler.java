package Handlers;
import java.io.*;

/**
*	Defines general characteristics of an Image Handler object.
* 	Image Handlers are capable of reading bytes of an file, and also generate files.
*	Abstract class ImageHandler should be inherit by any ImageHandler used for this project.
*
*   @author Auxiliares
*	@version 1.0
**/
public abstract class ImageHandler {
    
	/* NO CAMBIE ESTE CODIGO */
	/**
	*	Represents the file name of the original file being handled by this class
	**/
	protected String handledFileName;
	
	/**
	*	Builds and returns an ImageHandler subclass type object which handles the file 
	* 	represented by the given name
	*	@param filename Name of the original file being handled by this object
	**/
	public ImageHandler(String filename) {
		this.handledFileName = filename;
	}

	/**
	*	Return the name of the original file being handled by this object 
	*	@return filename Name of the original file being handled by this object
	**/
	public final String getFileName() {
		return this.handledFileName;
	}

	/**
	*	Reads handled file header and data in bytes
	**/
	public abstract void readFile() throws Exception;

	/**
	*	Generates all files from the original file. Generated files depend on
	* 	the specific function of the ImageHandler subclass type
	**/
	public abstract void generateFiles() throws Exception;
}