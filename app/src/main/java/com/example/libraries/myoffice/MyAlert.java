package com.example.libraries.myoffice;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

/**
 * Created by Libraries on 13/1/2561.
 */

public class MyAlert {
    //Explicit
    private Context context;
    private String titleString,messageString;

    public MyAlert(Context context,
                   String titleString,
                   String messageString) {
        this.context = context;
        this.titleString = titleString;
        this.messageString = messageString;
    }

    public void myDialog(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setTitle(titleString);
        builder.setMessage(messageString);
        builder.setIcon(R.drawable.ic_action_builderlogo);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();

    }

}// Main Class
