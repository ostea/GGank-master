package com.gankmz.library.update;

public interface DownLoadListener {

    void onCancel();

    void onDone(boolean canceled, int error);

    void onPercentUpdate(int percent);
}
