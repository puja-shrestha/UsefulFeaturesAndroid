package com.example.puza.usefulfeatures.expandableListViewWIthImagesAndTexts;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.puza.usefulfeatures.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends BaseExpandableListAdapter {

    private Context c;
    private ArrayList<Team> team;
    private LayoutInflater inflater;

    public CustomAdapter(Context c,ArrayList<Team> team)
    {
        this.c=c;
        this.team=team;
        inflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //GET A SINGLE PLAYER
    @Override
    public Object getChild(int groupPos, int childPos) {
        // TODO Auto-generated method stub
        return team.get(groupPos).players.get(childPos);
    }

    //GET PLAYER ID
    @Override
    public long getChildId(int arg0, int arg1) {
        // TODO Auto-generated method stub
        return 0;
    }

    //GET PLAYER ROW
    @Override
    public View getChildView(int groupPos, int childPos, boolean isLastChild, View convertView,
                             ViewGroup parent) {

        //ONLY INFLATER XML ROW LAYOUT IF ITS NOT PRESENT,OTHERWISE REUSE IT

        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.player, null);
        }

        //GET CHILD/PLAYER NAME
        String  child=(String) getChild(groupPos, childPos);

        //SET CHILD NAME
        TextView nameTv=(TextView) convertView.findViewById(R.id.textView1);
        ImageView img=(ImageView) convertView.findViewById(R.id.imageView1);

        nameTv.setText(child);

        //GET TEAM NAME
        String teamName= getGroup(groupPos).toString();

        //ASSIGN IMAGES TO PLAYERS ACCORDING TO THEIR NAMES AN TEAMS
        if(teamName=="Ac Check Up Servicing")
        {
            if(child=="Wayne Rooney")
            {
                img.setImageResource(R.drawable.logout) ;
            }else if(child=="Ander Herera")
            {
                img.setImageResource(R.drawable.logout) ;
            }else if(child=="Van Persie")
            {
                img.setImageResource(R.drawable.logout)  ;
            }else if(child=="Juan Mata")
            {
                img.setImageResource(R.drawable.logout)   ;
            }
        }else if(teamName=="Mobile Repairing")
        {
            if(child=="John Terry")
            {
                img.setImageResource(R.drawable.image)  ;
            }else if(child=="Eden Hazard")
            {
                img.setImageResource(R.drawable.image) ;
            }else if(child=="Oscar")
            {
                img.setImageResource(R.drawable.image)  ;
            }else if(child=="Diego Costa")
            {
                img.setImageResource(R.drawable.image)  ;
            }
        }else if(teamName=="Plumbing")
        {
            if(child=="Jack Wilshere")
            {
                img.setImageResource(R.drawable.image)   ;
            }else if(child=="Alexis Sanchez")
            {
                img.setImageResource(R.drawable.image)    ;
            }else if(child=="Aaron Ramsey")
            {
                img.setImageResource(R.drawable.image) ;
            }else if(child=="Mesut Ozil")
            {
                img.setImageResource(R.drawable.image)   ;
            }
        }

        return convertView;
    }

    //GET NUMBER OF PLAYERS
    @Override
    public int getChildrenCount(int groupPosw) {
        // TODO Auto-generated method stub
        return team.get(groupPosw).players.size();
    }

    //GET TEAM
    @Override
    public Object getGroup(int groupPos) {
        // TODO Auto-generated method stub
        return team.get(groupPos);
    }

    //GET NUMBER OF TEAMS
    @Override
    public int getGroupCount() {
        // TODO Auto-generated method stub
        return team.size();
    }

    //GET TEAM ID
    @Override
    public long getGroupId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    //GET TEAM ROW
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        //ONLY INFLATE XML TEAM ROW MODEL IF ITS NOT PRESENT,OTHERWISE REUSE IT
        if(convertView == null)
        {
            convertView=inflater.inflate(R.layout.team, null);
        }

        //GET GROUP/TEAM ITEM
        Team t=(Team) getGroup(groupPosition);

        //SET GROUP NAME
        TextView nameTv=(TextView) convertView.findViewById(R.id.textView1);
        ImageView img=(ImageView) convertView.findViewById(R.id.imageView1);
        TextView button=(TextView) convertView.findViewById(R.id.button);

        String name=t.Name;
        nameTv.setText(name);

        String btn = t.Btn;
        button.setText(btn);

        //ASSIGN TEAM IMAGES ACCORDING TO TEAM NAME

        if(name=="Ac Check Up Servicing")
        {
            img.setImageResource(R.drawable.image);
        }else if(name=="Mobile Repairing")
        {
            img.setImageResource(R.drawable.image);
        }else if(name=="Plumbing")
        {
            img.setImageResource(R.drawable.image);
        }

        //SET TEAM ROW BACKGROUND COLOR
        convertView.setBackgroundColor(Color.WHITE);

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isChildSelectable(int arg0, int arg1) {
        // TODO Auto-generated method stub
        return true;
    }

}