import { ToastContainer} from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import { Route } from 'react-router-dom';
import './App.css';
import Routes from './Routes';

function App() {
  return (
    <div>
      <>
        <Routes/>
        <ToastContainer/>
      </>
    </div>
  );
}

export default App;
