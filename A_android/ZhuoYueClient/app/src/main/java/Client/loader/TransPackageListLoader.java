package Client.loader;

import java.util.List;

import android.app.Activity;
import Client.misc.model.TransPackage;
import Client.net.HttpAsyncTask;
import Client.net.IDataAdapter;
import Client.net.HttpResponseParam.RETURN_STATUS;
import Client.ui.main.ExTraceApplication;

public class TransPackageListLoader extends HttpAsyncTask{

	String url;
	IDataAdapter<List<TransPackage>> adapter;
	private Activity context;
	
	public TransPackageListLoader(IDataAdapter<List<TransPackage>> adpt, Activity context) {
		super(context);
		this.context = context;
		adapter = adpt;
		url = ((ExTraceApplication)context.getApplication()).getDomainServiceUrl();
	}

	@Override
	public void onDataReceive(String class_name, String json_data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStatusNotify(RETURN_STATUS status, String str_response) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 新增
	 * @param id
	 */
	public void Load(String id)
	{
		url += "getTransPackage/"+ id + "?_type=json";
		try {
			execute(url, "GET");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
