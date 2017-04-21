package com.app.gautam.moodymusic;

import android.content.Context;
import android.widget.MediaController;

/**
 * Created by gautam on 26-02-2017.
 */

public class MusicController extends MediaController {
    public MusicController(Context context) {
        super(context);
    }

    @Override
    public void show(int timeout) {
        super.show(0);
    }

}
