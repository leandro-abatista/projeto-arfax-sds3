import ImgDsDark from 'assets/img/ds-dark.png'

function NavBar() {
    return (
        <div>
            <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm">
                <div className="container">
                    <nav className="my-2 my-md-0 mr-md-3">
                        <img src={ImgDsDark} alt="DevSuperior" width="120" />
                    </nav>
                </div>
            </div>
        </div>
    );
}

/**outra forma de declarar uma função javascript */
const NavBar2 = () => {
    return (
        <div>
            <h2 className="text-primary">Arfax Tecnologia</h2>
        </div>
    );
}

export default NavBar;