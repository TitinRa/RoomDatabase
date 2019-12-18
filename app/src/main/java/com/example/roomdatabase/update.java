package com.example.roomdatabase;

public class update {
    case R.id.update:
    Intent dataForm = new Intent(view.getContext(), UpdateActivity.class);
   dataForm.putExtra("SendNIM", holder.Nim.getText().toString());
   dataForm.putExtra("SendNama", holder.Nama.getText().toString());
   context.startActivity(dataForm);
   ((Activity)context).finish();
   break;
}
