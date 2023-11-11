package com.example.listviewpersonalizado;

// CustomListAdapter.java
public class CustomListAdapter extends ArrayAdapter<Figure> {
    public CustomListAdapter(Context context, List<Figure> figures) {
        super(context, 0, figures);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Figure figure = getItem(position);

        TextView tvFigureName = convertView.findViewById(R.id.tvFigureName);
        TextView tvFormula = convertView.findViewById(R.id.tvFormula);

        // Setear el nombre de la figura y la fórmula en los TextViews

        return convertView;
    }
}

