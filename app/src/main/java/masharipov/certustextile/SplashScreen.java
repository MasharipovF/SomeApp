package masharipov.certustextile;

import android.content.Intent;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

import masharipov.certustextile.main.MainActivity;


public class SplashScreen extends AwesomeSplash {
    @Override
    public void initSplash(ConfigSplash configSplash) {
        //Customize Circular Reveal
        configSplash.setBackgroundColor(R.color.cardview_light_background); //any color you want form colors.xml
        configSplash.setAnimCircularRevealDuration(2000); //int ms
        configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);  //or Flags.REVEAL_LEFT
        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM); //or Flags.REVEAL_TOP

        //Choose LOGO OR PATH; if you don't provide String value for path it's logo by default

        //Customize Logo
        configSplash.setLogoSplash(R.drawable.logo); //or any other drawable
        configSplash.setAnimLogoSplashDuration(2000); //int ms
        configSplash.setAnimLogoSplashTechnique(Techniques.FadeIn); //choose one form Techniques (ref: https://github.com/daimajia/AndroidViewAnimations)

        //Customize Path
        //configSplash.setPathSplash(path); //set path String
        configSplash.setOriginalHeight(300); //in relation to your svg (path) resource
        configSplash.setOriginalWidth(500); //in relation to your svg (path) resource
        configSplash.setAnimPathStrokeDrawingDuration(3000);
        configSplash.setPathSplashStrokeSize(1); //I advise value be <5
        configSplash.setPathSplashStrokeColor(R.color.logo); //any color you want form colors.xml
        configSplash.setAnimPathFillingDuration(1000);
        configSplash.setPathSplashFillColor(R.color.logo); //path object filling color


        //Customize Title
        configSplash.setTitleSplash("Certus Textile");
        configSplash.setTitleTextColor(R.color.colorAccent);
        configSplash.setTitleTextSize(30f); //float value
        configSplash.setAnimTitleDuration(1000);
        configSplash.setAnimTitleTechnique(Techniques.FlipInX);
        configSplash.setTitleFont("fonts/slimjim.ttf"); //provide string to your font located in assets/fonts/
    }

    @Override
    public void animationsFinished() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public static final String path =
            " M 37.00,0.00" +
                    " C 46.24,0.00 54.02,-0.70 63.00,2.04" +
                    " 72.45,4.92 82.65,10.79 87.00,20.00" +
                    " 84.47,20.97 78.53,23.43 76.00,23.04" +
                    " 71.76,22.40 69.99,17.78 60.00,14.52" +
                    " 45.04,9.64 23.93,12.70 16.06,28.00" +
                    " 13.57,32.84 14.00,35.79 14.00,41.00" +
                    " 14.00,41.00 0.00,40.00 0.00,40.00" +
                    " 0.00,40.00 0.00,0.00 0.00,0.00" +
                    " 0.00,0.00 37.00,0.00 37.00,0.00 Z" +
                    " M 86.00,11.00" +
                    " C 86.00,11.00 85.00,12.00 85.00,12.00" +
                    " 85.00,12.00 85.00,11.00 85.00,11.00" +
                    " 85.00,11.00 86.00,11.00 86.00,11.00 Z" +
                    " M 449.00,13.01" +
                    " C 453.17,12.11 454.79,12.02 459.00,12.00" +
                    " 476.06,11.92 481.35,11.77 497.00,20.00" +
                    " 495.61,23.08 493.41,27.08 489.91,28.16" +
                    " 487.18,29.00 483.62,27.22 481.00,26.35" +
                    " 475.99,24.70 473.29,24.07 468.00,24.00" +
                    " 462.48,23.94 452.72,23.25 448.10,26.08" +
                    " 445.83,27.48 443.91,30.07 442.00,32.00" +
                    " 442.00,32.00 456.00,34.83 456.00,34.83" +
                    " 467.47,36.04 491.00,35.79 497.77,46.17" +
                    " 499.68,49.09 499.83,51.66 500.00,55.00" +
                    " 497.17,55.00 489.56,55.30 487.28,54.44" +
                    " 484.02,53.20 483.89,50.96 477.00,49.45" +
                    " 477.00,49.45 444.00,45.84 444.00,45.84" +
                    " 436.05,43.68 431.51,40.65 431.00,32.00" +
                    " 431.00,32.00 440.00,31.00 440.00,31.00" +
                    " 440.00,31.00 431.00,31.00 431.00,31.00" +
                    " 431.28,19.99 439.03,15.17 449.00,13.01 Z" +
                    " M 160.00,13.00" +
                    " C 169.46,13.06 169.33,17.79 167.00,26.00" +
                    " 156.37,24.09 129.30,25.00 117.00,25.00" +
                    " 117.00,25.00 117.00,30.00 117.00,30.00" +
                    " 117.00,30.00 104.00,30.00 104.00,30.00" +
                    " 104.00,30.00 104.00,13.00 104.00,13.00" +
                    " 104.00,13.00 160.00,13.00 160.00,13.00 Z" +
                    " M 223.00,13.00" +
                    " C 230.44,13.00 238.17,12.25 244.99,15.83" +
                    " 251.50,19.26 253.50,24.09 254.01,31.00" +
                    " 254.76,41.08 251.96,48.91 241.00,51.00" +
                    " 241.00,51.00 256.00,73.99 256.00,73.99" +
                    " 252.39,75.02 244.65,75.93 241.30,73.99" +
                    " 236.99,71.46 229.39,56.58 224.83,54.02" +
                    " 222.80,52.89 220.25,53.02 218.00,53.00" +
                    " 218.00,53.00 197.00,53.00 197.00,53.00" +
                    " 197.00,53.00 197.00,68.00 197.00,68.00" +
                    " 197.00,68.00 195.40,73.98 195.40,73.98" +
                    " 195.40,73.98 184.00,75.00 184.00,75.00" +
                    " 184.00,75.00 184.00,13.00 184.00,13.00" +
                    " 184.00,13.00 223.00,13.00 223.00,13.00 Z" +
                    " M 317.00,13.00" +
                    " C 320.00,13.00 330.40,12.44 332.40,14.02" +
                    " 333.67,15.03 333.82,16.52 333.94,18.02" +
                    " 334.18,20.88 334.39,24.56 330.87,25.07" +
                    " 330.87,25.07 305.00,25.07 305.00,25.07" +
                    " 305.00,25.07 305.00,75.00 305.00,75.00" +
                    " 305.00,75.00 292.00,75.00 292.00,75.00" +
                    " 292.00,75.00 292.00,39.00 292.00,39.00" +
                    " 292.02,36.22 292.54,30.48 291.45,28.15" +
                    " 289.97,24.97 287.03,25.06 284.00,25.08" +
                    " 284.00,25.08 266.13,25.08 266.13,25.08" +
                    " 261.61,24.40 263.00,16.43 263.00,13.00" +
                    " 263.00,13.00 317.00,13.00 317.00,13.00 Z" +
                    " M 416.00,40.00" +
                    " C 416.06,49.42 417.33,60.58 409.82,67.67" +
                    " 398.91,77.97 377.65,78.88 364.00,74.86" +
                    " 358.00,73.09 351.57,70.15 347.80,64.96" +
                    " 344.13,59.92 344.01,54.94 344.00,49.00" +
                    " 344.00,49.00 344.00,22.00 344.00,22.00" +
                    " 344.00,20.01 343.77,16.19 345.02,14.60" +
                    " 346.80,12.35 355.20,12.35 356.98,14.60" +
                    " 359.57,17.88 357.65,29.44 356.00,33.00" +
                    " 359.26,35.93 357.99,43.75 358.00,48.00" +
                    " 358.01,51.44 357.74,54.85 359.89,57.79" +
                    " 366.24,66.50 391.63,66.15 398.77,58.79" +
                    " 403.30,54.12 401.96,46.07 402.00,40.00" +
                    " 402.01,38.22 401.83,35.18 402.99,33.74" +
                    " 404.25,32.18 408.88,31.62 411.00,31.00" +
                    " 409.01,30.99 405.19,31.24 403.60,29.98" +
                    " 401.26,28.13 401.26,15.87 403.60,14.02" +
                    " 405.59,12.45 413.32,12.50 414.98,14.60" +
                    " 416.04,15.94 415.97,18.38 416.00,20.00" +
                    " 416.10,25.87 416.32,27.50 414.00,33.00" +
                    " 416.46,35.20 415.98,36.82 416.00,40.00 Z" +
                    " M 433.00,18.00" +
                    " C 433.00,18.00 432.00,19.00 432.00,19.00" +
                    " 432.00,19.00 432.00,18.00 432.00,18.00" +
                    " 432.00,18.00 433.00,18.00 433.00,18.00 Z" +
                    " M 117.00,31.00" +
                    " C 117.00,31.00 117.00,37.00 117.00,37.00" +
                    " 117.00,37.00 152.00,37.00 152.00,37.00" +
                    " 152.00,37.00 152.00,49.00 152.00,49.00" +
                    " 152.00,49.00 117.00,49.00 117.00,49.00" +
                    " 117.00,49.00 117.00,55.00 117.00,55.00" +
                    " 117.00,55.00 104.00,55.00 104.00,55.00" +
                    " 104.00,55.00 104.00,31.00 104.00,31.00" +
                    " 104.00,31.00 117.00,31.00 117.00,31.00 Z" +
                    " M 441.00,32.00" +
                    " C 441.00,32.00 442.00,33.00 442.00,33.00" +
                    " 442.00,33.00 442.00,32.00 442.00,32.00" +
                    " 442.00,32.00 441.00,32.00 441.00,32.00 Z" +
                    " M 14.00,43.00" +
                    " C 16.10,62.71 44.45,67.35 60.00,62.25" +
                    " 68.39,59.50 72.11,55.06 75.00,54.19" +
                    " 78.55,53.13 79.90,55.74 86.00,56.00" +
                    " 86.00,56.00 87.00,60.00 87.00,60.00" +
                    " 77.92,69.00 68.79,74.59 56.00,76.89" +
                    " 56.00,76.89 33.00,76.89 33.00,76.89" +
                    " 33.00,76.89 0.00,76.89 0.00,76.89" +
                    " 0.00,76.89 0.00,43.00 0.00,43.00" +
                    " 0.00,43.00 14.00,43.00 14.00,43.00 Z" +
                    " M 360.00,54.00" +
                    " C 360.00,54.00 359.00,55.00 359.00,55.00" +
                    " 359.00,55.00 359.00,54.00 359.00,54.00" +
                    " 359.00,54.00 360.00,54.00 360.00,54.00 Z" +
                    " M 117.00,56.00" +
                    " C 117.00,56.00 117.00,63.00 117.00,63.00" +
                    " 117.00,63.00 170.00,63.00 170.00,63.00" +
                    " 170.00,72.79 170.88,74.85 163.00,75.00" +
                    " 163.00,75.00 104.00,75.00 104.00,75.00" +
                    " 104.00,75.00 104.00,56.00 104.00,56.00" +
                    " 104.00,56.00 117.00,56.00 117.00,56.00 Z" +
                    " M 436.09,56.81" +
                    " C 437.81,56.85 443.72,60.07 446.00,60.94" +
                    " 452.37,63.35 457.26,63.99 464.00,64.00" +
                    " 469.62,64.01 475.80,64.07 480.96,61.44" +
                    " 484.81,59.46 485.11,57.15 488.21,56.15" +
                    " 488.21,56.15 500.00,56.15 500.00,56.15" +
                    " 500.00,56.15 500.00,77.00 500.00,77.00" +
                    " 473.24,77.00 452.23,80.04 428.00,66.00" +
                    " 429.26,63.02 432.26,56.72 436.09,56.81 Z";
}
