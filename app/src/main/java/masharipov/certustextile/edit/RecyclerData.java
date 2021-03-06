package masharipov.certustextile.edit;

import masharipov.certustextile.R;

public class RecyclerData {
    String styleUri, frontUri, sideUri, backUri, uniqueID;
    String gender, tag, collar, size, type, typeRus, addText;
    int addID, sizePos, selectedColor, genderImageResourse;
    int isSection, internalID;
    boolean isAddButton;
    public int stableID;

    public RecyclerData() {
        styleUri = null;
        frontUri = null;
        backUri = null;
        sideUri = null;
        isAddButton = true;
        addID = R.drawable.ic_add_green_800_24dp;
        addText = "Добавить";
        size = null;
        gender = null;
        tag = "";
        collar = null;
        type = null;
        typeRus = null;
        isSection = 0;
        genderImageResourse = -1;
    }

    //SETTERS

    public void setInternalID(int id) {
        internalID = id;
    }

    public void setSection(int type) {
        isSection = type;
    }

    public void setAddID(int resID) {
        addID = resID;
    }

    public void setAddText(String name) {
        addText = name;
    }

    public void setSize(String string) {
        size = string;
    }

    public void setSizePos(int pos) {
        sizePos = pos;
    }

    public void setID(String id) {
        uniqueID = id;
    }

    public void setSelectedColor(int color) {
        selectedColor = color;
    }

    public void setGenderImageResourse(int rID) {
        genderImageResourse = rID;
    }

    public void setImageUri(String type, String path) {
        switch (type) {
            case "style":
                styleUri = path;
                break;
            case "front":
                frontUri = path;
                break;
            case "back":
                backUri = path;
                break;
            case "side":
                sideUri = path;
                break;
            default:
                break;
        }

    }

    public void setType(String string) {
        type = string;
    }

    public void setTypeRus(String string) {
        typeRus = string;
    }

    public void setGender(String string) {
        gender = string;
    }

    public void setCollar(String string) {
        collar = string;
    }

    public void setTag(String string) {
        tag = string;
    }


    //GETTERS
    public int getSection() {
        return isSection;
    }

    public String getImageUri(String type) {
        String returnPath;
        switch (type) {
            case "style":
                returnPath = styleUri;
                break;
            case "front":
                returnPath = frontUri;
                break;
            case "back":
                returnPath = backUri;
                break;
            case "side":
                returnPath = sideUri;
                break;
            default:
                returnPath = null;
                break;
        }
        return returnPath;
    }

    public String getID() {
        return uniqueID;
    }

    public String getTag() {
        return tag;
    }

    public String getCollar() {
        return collar;
    }

    public String getSize() {
        return size;
    }

    public String getGender() {
        return gender;
    }

    public int getAddID() {
        return addID;
    }

    public String getTypeRus() {
        return typeRus;
    }

    public String getType() {
        return type;
    }

    public int getSelectedColor() {
        return selectedColor;
    }

    public int getGenderImageResourse() {
        return genderImageResourse;
    }

    public int getInternalID() {
        return internalID;
    }
}