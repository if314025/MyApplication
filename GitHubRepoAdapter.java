package bolalob.develops.stud11314025.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Okta on 05/07/2017.
 */

class GitHubRepoAdapter extends ArrayAdapter<GitHubRepo> {
    public GitHubRepoAdapter(Context context, List<GitHubRepo> repos) {
        super(context,0,repos);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GitHubRepo gitHubRepo = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvHome = (TextView) convertView.findViewById(R.id.tvHome);
        // Populate the data into the template view using the data object
        tvName.setText( String.valueOf(gitHubRepo.getId()));
        tvHome.setText(gitHubRepo.getName());
        // Return the completed view to render on screen
        return convertView;
    }
}
