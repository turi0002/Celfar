package com.example.user.cel_far;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by User on 23/02/2018.
 */

public class My_dialog extends DialogFragment {
    public final static int EXIT_DIALOG =1;
    public final static int PRECISION_DIALOG =2;

    private int reqCode;
    public static My_dialog dlg=null;

    static My_dialog newInstance(int reqCode2){
        if(dlg==null)
            dlg = new My_dialog();
        Bundle args = new Bundle();
        args.putInt("rc",reqCode2);
        dlg.setArguments(args);
        return dlg;
    }

    public  Dialog OnCreateDialog(Bundle savedInstanceState){
        this.reqCode = getArguments().getInt("rc");
        if(reqCode == EXIT_DIALOG)
            return  buildExitDialog().create();
    }

    private AlertDialog.Builder buildExitDialog(){
        return new AlertDialog.Builder(getActivity())
                .setTitle("closing the app")
                .setMessage("are you sure")
                .setPositiveButton("yes",
                        new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Context context = getActivity();
                        CharSequence text = "You pressed yes";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                })
                .setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dismiss();
                    }
                });
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }
}
