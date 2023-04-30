/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasEnlazadas;

/**
 *
 * @author lobje
 */
public class ImagenP {
    private String name;
    private String path_;
    private ImagenP next;
    private ImagenP back;

    public ImagenP(String name, String path_) {
        this.name = name;
        this.path_ = path_;
        this.next = null;
        this.back = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath_() {
        return path_;
    }

    public void setPath_(String path_) {
        this.path_ = path_;
    }

    public ImagenP getNext() {
        return next;
    }

    public void setNext(ImagenP next) {
        this.next = next;
    }

    public ImagenP getBack() {
        return back;
    }

    public void setBack(ImagenP back) {
        this.back = back;
    }
    
    public void setNextBack(ImagenP next, ImagenP back){
        this.next = next;
        this.back = back;
    }
}
