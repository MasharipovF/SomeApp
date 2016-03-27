package masharipov.certustextile;

import android.net.Uri;

public class RecyclerData {
    Uri styleUri, frontUri, sideUri, backUri;

    public RecyclerData() {
        styleUri = null;
        frontUri = null;
        backUri = null;
        sideUri = null;
    }

    public void setImageUri(String type, Uri uri) {
        switch (type) {
            case "style":
                styleUri = uri;
                break;
            case "front":
                frontUri = uri;
                break;
            case "back":
                backUri = uri;
                break;
            case "side":
                sideUri = uri;
                break;
            default:
                break;
        }

    }

    public Uri getImageUri(String type) {
        Uri returnUri;
        switch (type) {
            case "style":
                returnUri = styleUri;
                break;
            case "front":
                returnUri = frontUri;
                break;
            case "back":
                returnUri = backUri;
                break;
            case "side":
                returnUri = sideUri;
                break;
            default:
                returnUri = null;
                break;
        }
        return returnUri;
    }


}