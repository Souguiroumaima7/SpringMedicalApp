import './App.css';

import Header from '../src/Compoments/Header' ;
import Appointement from './src/Compoments/Appointement' ;
import Confirmation from '../src/Compoments/Confirmation' ;
import Contact from '../src/Compoments/Contact' ;
import Department from '../src/Compoments/Department' ;
import Doctors from '../src/Compoments/Doctors';
import Documentation from '../src/Compoments/Documentation' ;
import Footer from '../src/Compoments/Footer' ;
import Partenaires  from '../src/Compoments/Partenaires';
import Service from '../src/Compoments/Service';
import SideBarBlog from './Compoments/SidebarBlog' ;
import Slider from '../src/Compoments/Slider' ;
import SingleBlog from '../src/Compoments/SingleBlog' ;
import Testimonials from '../src/Compoments/Testimonials';
import ListOfDepartment from '../src/views/ListOfDepartment' ;
import ListOfDoctors from '../src/views/ListOfDoctors';

import { BrowserRouter, Route} from 'react-router-dom';


function App() {
  return (
    <div className="App">
     <BrowserRouter >
   <routes>
    <Route path="/" element={<Root />}>
    <Route path="Header" element={<Header />} />
      <Route path="Appointement" element={<Appointement />} />
      <Route path="Confirmation" element={<Confirmation />} />
      <Route path="Contact" element={<Contact />} />
      <Route path="Department" element={<Department />} />
      <Route path="Doctors" element={<Doctors />} />
      <Route path="Documentation" element={<Documentation />} />
      <Route path="Footer" element={<Footer />} />
      <Route path="Partenaires" element={<Partenaires />} />
      <Route path="Service" element={<Service />} />
      <Route path="SideBarBlog" element={<SideBarBlog />} />
      <Route path="Slider" element={<Slider />} />
      <Route path="SingleBlog" element={<SingleBlog />} />
      <Route path="Testimonials" element={<Testimonials />} />
      <Route path="ListOfDepartment" element={<ListOfDepartment />} />
      <Route path="ListOfDoctors" element={<ListOfDoctors />} />
    </Route>
    </routes>
    </BrowserRouter>
    </div>
  );
}


export default App;
