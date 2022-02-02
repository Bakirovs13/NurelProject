package kg.geektech.nurelproject;


import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Model> states;

    MyAdapter(Context context, List<Model> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.itemka_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        Model countryList = states.get(position);
        holder.nameView.setText(countryList.getText());
        holder.checkBox.setOnClickListener(view -> {
            if (holder.checkBox.isChecked()){
                holder.nameView.setPaintFlags(holder.nameView.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            }else{
                holder.nameView.setPaintFlags(holder.nameView.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
            }
        });
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CheckBox checkBox;
        final TextView nameView;
        ViewHolder(View view){
            super(view);

            checkBox = (CheckBox) view.findViewById(R.id.checkBox);
            nameView = (TextView) view.findViewById(R.id.textView);
        }
    }
}