import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { SpringbootJhipsterSharedModule } from '../../shared';
import {
    DepartmentMySuffixService,
    DepartmentMySuffixPopupService,
    DepartmentMySuffixComponent,
    DepartmentMySuffixDetailComponent,
    DepartmentMySuffixDialogComponent,
    DepartmentMySuffixPopupComponent,
    DepartmentMySuffixDeletePopupComponent,
    DepartmentMySuffixDeleteDialogComponent,
    departmentRoute,
    departmentPopupRoute,
} from './';

const ENTITY_STATES = [
    ...departmentRoute,
    ...departmentPopupRoute,
];

@NgModule({
    imports: [
        SpringbootJhipsterSharedModule,
        RouterModule.forRoot(ENTITY_STATES, { useHash: true })
    ],
    declarations: [
        DepartmentMySuffixComponent,
        DepartmentMySuffixDetailComponent,
        DepartmentMySuffixDialogComponent,
        DepartmentMySuffixDeleteDialogComponent,
        DepartmentMySuffixPopupComponent,
        DepartmentMySuffixDeletePopupComponent,
    ],
    entryComponents: [
        DepartmentMySuffixComponent,
        DepartmentMySuffixDialogComponent,
        DepartmentMySuffixPopupComponent,
        DepartmentMySuffixDeleteDialogComponent,
        DepartmentMySuffixDeletePopupComponent,
    ],
    providers: [
        DepartmentMySuffixService,
        DepartmentMySuffixPopupService,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SpringbootJhipsterDepartmentMySuffixModule {}
