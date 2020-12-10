package szabo.fpv.umb.zpznamobjektov;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
        List<Country> listOfCountry;
        Context context;

        public MyAdapter(Context ct, List<Country> list){
            context = ct;
            listOfCountry = list;
        }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.myText1.setText(listOfCountry.get(position).getNameOfCountry());
            holder.myText2.setText(listOfCountry.get(position).getAreaOfCountry());
    }

    @Override
    public int getItemCount() {
        return listOfCountry.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
            TextView myText1,myText2;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.textView1);
            myText2 = itemView.findViewById(R.id.textView2);
        }
    }
}
