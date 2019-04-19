import java.util.ArrayList;

public class MWFSIterator implements Iterator {
		ArrayList items;
		int position = 0;

		public MWFSIterator(ArrayList items) {
			// TODO Auto-generated constructor stub
			this.items = items;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(position >= items.size() || items.get(position) == null)
				return false;
			else
				return true;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			MenuItem menuItem = (MenuItem)items.get(position);
			position += 1;
			return menuItem;
		}
	}