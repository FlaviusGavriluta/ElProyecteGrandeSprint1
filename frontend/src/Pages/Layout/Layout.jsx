import { Outlet, Link } from "react-router-dom";

import "./Layout.css";

const Layout = () => (
    <div className="Layout">
        <nav>
            <ul>
                <li className="grow">
                    <Link to="/">User</Link>
                </li>
                <li className="grow">
                    <Link to="/">Item</Link>
                </li>
                <li>
                    <Link to="/create">
                        <button type="button">Create Item</button>
                    </Link>
                </li>
            </ul>
        </nav>
        <Outlet />
    </div>
);

export default Layout;