package sg.edu.rp.c346.p03_classjournal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GradeAdapter extends ArrayAdapter<Grade> {
    private ArrayList<Grade> grade;
    private Context context;
    private TextView tvWeek;
    private TextView tvGrade;
    private ImageView imDG;
    private TextView tvDG;

    public GradeAdapter(Context context, int resource, ArrayList<Grade> objects) {
        super(context, resource, objects);

        grade = objects;

        this.context = context;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);


        // Get the TextView object
        tvWeek= (TextView) rowView.findViewById(R.id.textViewWeek);
        tvGrade = (TextView) rowView.findViewById(R.id.textViewGrade);
        tvDG = (TextView) rowView.findViewById(R.id.textViewDG);
        imDG = (ImageView) rowView.findViewById(R.id.imageViewDG);
        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Grade currentGrade = grade.get(position);
        // Set the TextView to show the food


        tvWeek.setText("Week" + currentGrade.getTvWeek());
        tvGrade.setText(currentGrade.getTvGrade());
        tvDG.setText(currentGrade.getTvDG());

        imDG.setImageResource(R.drawable.dg);
        return rowView;
    }


}
